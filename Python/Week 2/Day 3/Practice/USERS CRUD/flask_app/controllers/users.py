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

@app.route('/user/<int:id>')
def show_user(id):
    data={"id":id}
    user=User.get_by_id(data)
    return render_template("show_user.html",user=user)

# DISPLAY 
@app.route('/edit/<int:id>')
def edit_user(id):
    user_id_dict={"id":id}
    user=User.get_by_id(user_id_dict)
    return render_template("edit.html", user=user)

# ACTION

@app.route("/update/<int:id>",methods=["POST"])
def process_update(id):
    data={
        "id":id,
        "first_name":request.form["first_name"],
        "last_name":request.form["last_name"],
        "email":request.form["email"]

    }
    User.update(data)
    return redirect('/users')


@app.route('/user/delete/<int:id>')
def effacer(id):
    data={
        'id':id
    }
    User.delete(data)
    return redirect ('/users')
    
    
