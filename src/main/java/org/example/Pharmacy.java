package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

        Map<String, Medication> medications = new HashMap<>();

        public int getCount() {
            return medications.size();
        }

        public void save(Medication m) {
            medications.put(m.getName(), m);
        }

        public Medication find(String medicationName) {
            return medications.get(medicationName);
        }

        public void delete(String medicationName) {
            medications.remove(medicationName);
        }

        public void printAllMedications() {
            for (Medication m : medications.values()) {
                System.out.println(m);
            }
        }


}
