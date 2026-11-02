


package pkg;
public class Movie {
    String movieName;
    double rating;
    int numRatings;
    int revenue;

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }

    public Movie(String a, double b, int c, int d) {
        movieName = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }

    
    public void movieToString() {
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println(" ");
    }


    public String getMovieName() {
        return movieName;
    }

    public int getRevenue() {
        return revenue;
    }

    public double getRating(){
        return rating;
    }

    public void addRating(double a){
        double total = rating*numRatings;
        total += a;
        numRatings++;
        rating = total/numRatings;
        rating = (int)(rating*10);
        rating = rating/10;

    }

    public boolean compareRatings(Movie a){
        double b = a.getRating();
        boolean c = false;
        if(rating > b) {
            c =  true;
        } else if (rating < b) {
            c =  false;
        } 

        return c;
    }

    public String revenueToString(){
        
        

        int a = revenue % 1000;
        

        int b = ((revenue-a)/1000)%1000;
        

        int c = ((revenue-b)/1000) %1000;
       
        
        String fin = c + "," + b + "," + a;
      
        
        
        return fin;
    }


}