from flask import Flask, render_template,request,redirect,session
app = Flask(__name__) 
app.secret_key="secret"


@app.route('/index')          
def index():
    session["x"]=session.get("x",0)+1
    return render_template("index.html",x=session["x"])

# Action route

@app.route('/click')
def click():
    session["x"]=session.get("x")+1
    return render_template("index.html", x=session["x"])

@app.route('/clear')
def clear():
    session.clear()
    return redirect("/index")


if __name__=="__main__":   
    app.run(debug=True)

