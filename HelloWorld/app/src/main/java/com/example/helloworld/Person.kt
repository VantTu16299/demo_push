package com.example.helloworld

class Person(name: String, age: Int, address: String) {
    private var Name: String =""
    private var Age: Int = 0
    private var Address: String =""

    init{
        Name = name
        Age = age
        Address = address
    }

    fun setName(name : String){
        Name = name
    }
    fun getName() : String{
        return Name
    }
    fun setAge(age : Int){
        Age = age
    }
    fun getAge() : Int{
        return  Age
    }
    fun setAddress( address : String){
        Address = address
    }
    fun getAddress() : String{
        return Address
    }

}