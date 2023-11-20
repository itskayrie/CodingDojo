from flask import Flask, render_template, redirect, request, session
import random

app = Flask(__name__)
app.secret_key = "secret"
num=63



@app.route('/')
def index():
    
    return render_template("index.html")

@app.route('/guess',methods=['POST'])
def guess():
    session['guess'] = int(request.form['guess'])
    return redirect('/')


@app.route('/clear')
def clear():
    session.clear
    return redirect('/')


if __name__ == "__main__":
    app.run(debug=True)
