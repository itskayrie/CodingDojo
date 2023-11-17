from flask import Flask, render_template
app = Flask(__name__)

@app.route('/<x>/<y>/<color1>/<color2>')
def kiki(x,y,color1,color2):
    return render_template("index.html",color1=color1,color2=color2,x=x,y=y)


if __name__=="__main__":
    app.run(debug=True)