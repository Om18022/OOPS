package OOP;

/*
The class Movie is stated below. An instance of class Movie represents a film. This
class has the following three class variables:
● title, which is a String representing the title of the movie
● studio, which is a String representing the studio that made the movie
● rating, which is a String representing the rating of the movie (1 star, 2 star etc)
public class Movie {
private String title;
private String studio;
private String rating;
}
a) Write a constructor for the class Movie, which takes a String representing the title
of the movie, a String representing the studio, and a String representing the rating as
its arguments, and sets the respective class variables to these values.
b) Write a second constructor for the class Movie, which takes a String representing
the title of the movie and a String representing the studio as its arguments, and sets the
respective class variables to these values, while the class variable rating is set to "5 star".
c) Write a method get5StarMovies, which takes an array of base type Movie as its
argument, and returns a new array of only those movies in the input array with a rating of "5
star". You may assume the input array is full of Movie instances. The returned array need not
be full.
 */


public class OOPAdv2 {
    public static void main(String[] args) {
        Movie m1 = new Movie("KGF","ABC");
        Movie m2 = new Movie("KGF 2","ABC","4star");
        Movie m3 = new Movie("GADAR ","gd","5star");
        Movie m4 = new Movie("GADAR 2","gd","1star");
        Movie m5 = new Movie("OMG","AKS","2star");
        Movie m6 = new Movie("OMG 2","AKS");
        Movie m7 = new Movie("JAILER","RJP","5star");
        Movie[] m = {m1,m2,m3,m4,m5,m6,m7};
        Movie[] five=Movie.get5starmovie(m);
        for (Movie a : five) {
            System.out.println(a.getName() + " " + a.getRating());
        }

    }
}

class Movie{
    private String name;
    private String studio;
    private String rating;

    public Movie(String name, String studio, String rating) {
        this.name = name;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String name, String studio) {
        this.name = name;
        this.studio = studio;
        this.rating = "5star";
    }

    public String getName() {
        return name;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public static Movie[] get5starmovie(Movie[] m){
        int count = 0;
        for (Movie n:m) {
            if("5star".equals(n.getRating())){
                count++;
            }
        }
        Movie[] result = new Movie[count];
        int i = 0;
        for(Movie a : m){
            if("5star".equals(a.getRating())){
                result[i++] = a;
            }
        }
        return result;
    }
}

