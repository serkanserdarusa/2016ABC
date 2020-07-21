package Java;

class data {
       void employee() {//default
        System.out.println("I am employee");

    }

    //    c             p
    static class info extends data {
        @Override
        protected void employee() {//protected
            System.out.println("I am manager");
        }
    }

    public static class Day_6_Overriding extends info {
        @Override
        public void employee() {//public
            System.out.println("I am sales manager");
        }
    }
    /*
    same method,same return type,same parameter
    Cant be final-private-static
    Access modifier in subclass  meant to be  same or more visible than sup class
    private==>default==>protected==>public

     */
    public static void main(String[] args) {

        data a=new data();
        a.employee();
        info b=new info();
        b.employee();
        Day_6_Overriding c=new Day_6_Overriding();
        c.employee();


    }


    }

