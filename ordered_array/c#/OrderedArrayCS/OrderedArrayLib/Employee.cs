using System;
using System.Collections.Generic;
using System.Text;

namespace OrderedArrayLib {
    public enum Department {
        Software,
        Mechanical,
        Receivables,
        Payroll

    }

    class Employee {
        protected string fname;
        protected string lname;
        protected int id;
        protected int age;
        protected Department dept;

        public Employee(string fname, string lname, int id, int age, Department dept) {
            this.fname = fname;
            this.lname = lname;
            this.id = id;
            this.age = age;
            this.dept = dept;

        }

        public void setFname(string fname) {
            this.fname = fname;

        }

        public string getfname() {
            return fname;

        }

        public void setLname(string lname) {
            this.lname = lname;

        }

        public string getLname() {
            return lname;

        }

        public void setId(int id) {
            this.id = id;

        }

        public int getId() {
            return id;

        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setDept(Department dept) {
            this.dept = dept;

        }

        public Department getDept() {
            return dept;

        }

    }

}
