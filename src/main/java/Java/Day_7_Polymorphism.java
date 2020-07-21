package Java;


   /*
    Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance
    parent class reference, child object
    Same method different behaviours
	We use method overloading and overriding to achieve Polymorphism.
    */



    class student{

        public void Talk() {
            System.out.println("student is working");
        }
    }

    class friend extends student{

        public void cook() {
            System.out.println("mother is cooking");
        }

        public void Talk() {

            System.out.println("mother is talking");
        }
    }

    class child extends student{

        public void Swim() {

            System.out.println("father is swimming");
        }

        public void Talk() {

            System.out.println("father is talking");
        }
    }
public class Day_7_Polymorphism {

        public static void main(String[] args) {


            student        st    =   new friend();
            // reference type    referenceName     object
            //super                                  sub
            st.Talk();
            // st.cook();
            // reference type decides what can be called,
            // cook method is not exist in reference type

            student  st2  =  new   child();
            // st2.Swim();
            // student class (referencetype) does not have swim()
            st2.Talk();   // Octopus is talking
        }
    }



