using System;
using System.Collections.Generic;
using System.Text;

namespace OrderedArrayLib {
    public enum Team {
        Monkees,
        Rockstar,
        Fargo

    }

    public class Engineer : Employee {
        private Team team;
        private string project;

        public Engineer(string fname, string lname, int id, int age, Department dept, Team team, string project) : base(fname, lname, id, age, dept) {
            this.team = team;
            this.project = project;

        }

        public void setTeam(Team team) {
            this.team = team;

        }

        public Team getTeam() {
            return team;

        }

        public void setProject(string project) {
            this.project = project;

        }

        public string getProject() {
            return project;

        }

    }

}
