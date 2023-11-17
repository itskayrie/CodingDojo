from flask import Flask

app=Flask(__name__)

@app.route('/')
def index():
    return"hello world"

@app.route('/dojo')
def call(dojo):
    return"Dojo !"

@app.route('/say/<name>')
def say_name(name):
    return f"hi {name}!"

@app.route('/repeat/<word>/<int:num>')
def repeat(word,num):
    return word * num

if __name__=="__main__":
    app.run(debug=True)