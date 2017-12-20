using System;
using System.Collections.Generic;
using System.Text;

namespace OrderedArrayLib {
    public class Accountant : Employee {
        private string report;
        private string audit;

        public Accountant(string fname, string lname, int id, int age, Department dept, string report, string audit) : base(fname, lname, id, age, dept) {
            this.report = report;
            this.audit = audit;

        }

        public void setReport(string report) {
            this.report = report;

        }

        public string getReport() {
            return report;

        }

        public void setAudit(string audit) {
            this.audit = audit;

        }

        public string getAudit() {
            return audit;

        }

    }

}
