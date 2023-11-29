from flask import flash
from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
import re
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$') 

class User:
    def __init__(self,data):
        self.id=data['id']
        self.first_name=data['first_name']
        self.last_name=data['last_name']
        self.email=data['email']
        self.created_at=data['created_at']
        self.updated_at=data['updated_at']



    @classmethod
    def get_all(cls):
        query="""SELECT * FROM users;"""
        result=connectToMySQL(DATABASE).query_db(query)
        users=[]
        for row in result:
            one_user=cls(row)
            users.append(one_user)
        return users
        

    @classmethod
    def create(cls,data):
        query="""INSERT INTO users (first_name,last_name,email)VALUES(%(first_name)s,%(last_name)s,%(email)s);"""
        return  connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def get_by_id(cls,data):
        query="SELECT*FROM users WHERE id=%(id)s;"
        result=connectToMySQL(DATABASE).query_db(query,data)
        user = cls (result[0])
        return user

    @classmethod
    def update(cls,data):
        query="""UPDATE users SET first_name=%(first_name)s,last_name=%(last_name)s,email=%(email)s
                WHERE id=%(id)s; """
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod
    def delete(cls,data):
        query="DELETE FROM users WHERE id=%(id)s"
        result=connectToMySQL(DATABASE).query_db(query,data)