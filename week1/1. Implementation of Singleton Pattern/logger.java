public class Logger {

   private static Logger logger; 

    //Constructor called when we create an object
    private  Logger(){

    }
    public  static Logger getLogger()
    {
        //object of this class will be created


        if(logger==null){
           synchronized(Logger.class){
           if(logger==null){
  logger=new Logger();
           }
           }

        }
        return logger;
    }
}

/*
 * 1. Constructor should be private
 * 
 * 2. Object creation with the help of method(factory method)
 * 
 * 3. Create field to store object is private
 */