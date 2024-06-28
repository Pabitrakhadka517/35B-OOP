package week10;

public class InterfaceClass {
    public static void main(String[] args) {
        
    }
}
// interface is made as same as class replacing with "interface"
// interface cannot be made object of
interface AnimalDo{
    public void move();
    public boolean eat(String food);
    // function of interface is automatically public and abstract
}
//interface can extend another interface
interface MammalDo extends AnimalDo{
    public int legs();

}
//can be extended into multiple layer
interface DogDo extends MammalDo{
    public void bark();
}
interface DomasticAnimalDO{
    public void pet();
}
// class can extend multiple interface
class Husky implements DogDo, DomasticAnimalDO{
    // when implemeting multiple interface, all the function from implemented interfaces
    // should be overriden
    @Override 
    public void pet(){
        System.out.println("Husky likes pet");
    }

    // when implementing interface that extends another interface
    // must override all the function made on top of it
    @Override 
    public void bark(){
        System.out.println("Bow Wow");
    }
    @Override 
    public int legs(){
        return 4;
    }
    @Override 
    public void move(){
        System.out.println("Husky move fast");
    }
    @Override 
    public boolean eat(String food){
        System.out.println("Husky eat fish");
        return false;
    }
}
// "implements" keyword to use interface
class Wolf implements AnimalDo{
    // when implementing interface, all the function should be overriden
    @Override
    public void move(){
        System.out.println("wolf move fast");
    }
    @Override
    public boolean eat(String food){
        System.out.println("Wolf eat meat");
        return false;
    }

}
class Cow implements AnimalDo{
    @Override
    public void move(){
        System.out.println("Cow move slow");
    }
    @Override 
    public boolean eat(String food){
        System.out.println("Cow eat grass");
        return false;

    }
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String newPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * make a cllass Spotify and implementing DigitalMedia and OnlineAsset
 */
interface Media{
    void play();
    void pause();
    void next();
    void prevoius();
    String newPlaying();
}
interface DigitalMedia extends Media{
    double size();
    double remaining(double current);
}

interface OnlineAsset{
    void download();
}
