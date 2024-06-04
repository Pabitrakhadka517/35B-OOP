package Week7;

public class ConstructorRevise {
    public static void main(String[] args) {
        NonParameterizedConstructor np=new NonParameterizedConstructor();
        System.out.println(np.data2);
        ParameterizedConstructor pc=new ParameterizedConstructor(10, "Ram");
        System.out.println(pc.data2);
        pc.data2="Changing";
        // pc.data1=100; //
        pc.setData1(100);
        // System.out.println(pc.data1); //
        System.out.println(pc.getData1());
        

    

// Task 
// Make a class Song
// make 4 private property id, title, duration and artists
// make 2 public property album and description
// make constructor to set title and duration only
// make setter for id, duration and artists
// make getter for id, title, duration and artists
// make 2 object of Song
// Fill all the attributes
// Change the duration of 1st object
// Change the artists of 2nd object
// Print the following for both object
// Output
// Song 1
// Title: ABC
// Duration: 10
// Artists: XYZ
// Album: XX
// Description: Lorem Ipsum
// Song 2
// ..


        Song song1 = new Song("ABC", 10);
        Song song2 = new Song("DEF", 12);

        song1.setId(1);
        song1.setDuration(15); // Changing the duration
        song1.setArtists("XYZ");
        song1.album = "XX";
        song1.description = "Chal chaiya chiya";

        song2.setId(2);
        song2.setArtists("LMN"); // Setting initial artists
        song2.setArtists("PQR"); // Changing the artists
        song2.album = "YY";
        song2.description = "Dolor Sit Amet";

        System.out.println("Song 1");
        System.out.println("Title: " + song1.getTitle());
        System.out.println("Duration: " + song1.getDuration());
        System.out.println("Artists: " + song1.getArtists());
        System.out.println("Album: " + song1.album);
        System.out.println("Description: " + song1.description);

        System.out.println("\nSong 2");
        System.out.println("Title: " + song2.getTitle());
        System.out.println("Duration: " + song2.getDuration());
        System.out.println("Artists: " + song2.getArtists());
        System.out.println("Album: " + song2.album);
        System.out.println("Description: " + song2.description);
    }
}
        



class Song{
    private int id;
    private String title;
    private int duration;
    private String artists;

    public String album;
    public String description;

    Song(String title, int duration){
        this.title = title;
        this.duration = duration;
    }
    
    void setId(int id) {
        this.id = id;
    }

    // Setter for duration
    void setDuration(int duration) {
        this.duration = duration;
    }

    // Setter for artists
    void setArtists(String artists) {
        this.artists = artists;
    }


    int getId(){
        return this.id;
    }
    String getTitle(){
        return this.title;
    }
    int getDuration(){
        return this.duration;
    }

    String getArtists(){
        return this.artists;
    }
    
}

   




class ParameterizedConstructor{
    private int data1; //this.data1
    String data2;
    // Write only access to private property 
    void setData1(int data1){
        this.data1=data1;
        
    }
    //read only access to private property //
    int getData1(){
        return this.data1;
    }
    ParameterizedConstructor(int data1, String data2){
        this.data1=data1;
        this.data2=data2;


    }
}
class NonParameterizedConstructor{
    private int data1;
    String data2;
    NonParameterizedConstructor(){
        data1=10;
        data2="Ram";
        System.out.println("running in object creation");
    }
}
