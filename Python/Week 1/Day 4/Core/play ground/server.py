from flask import Flask, render_template
app = Flask(__name__)
# -------------------------------------------------


@app.route('/play/<color>/<num>')
def play(color,num):
    return render_template("say.html",color=color,num=num)

# ----------------------------------------------------
if __name__=="__main__":
    app.run(debug=True)