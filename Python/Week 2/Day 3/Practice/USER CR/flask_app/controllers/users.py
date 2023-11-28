from flask_app import app
from flask import render_template ,redirect,request,flash,session
from flask_app.models.user_model import User


@app.route("/")
def index():
    
    return render_template("create.html")

@app.route('/create/user', methods=["POST"])
def create_user():
    data={
        "first_name":request.form["first_name"],
        "last_name":request.form["last_name"],
        "email":request.form["email"]
    }
    User.create(data)
    return redirect('/users')

    
@app.route('/users')
def users():
    all_users=User.get_all()
    return render_template('read_all.html', all_users=all_users)




