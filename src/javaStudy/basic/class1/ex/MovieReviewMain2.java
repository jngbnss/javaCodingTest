package javaStudy.basic.class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        MovieReview movieReview1 = new MovieReview("인셉션", "인생은 무한 루프");
       reviews[0] = new MovieReview("인셉션", "인생은 무한 루프");
        MovieReview movieReview2 = new MovieReview("어바웃 타임", "인생 시간 영화!");
        reviews[1]  = new MovieReview("어바웃 타임", "인생 시간 영화!");
        for (MovieReview review : reviews) {
            System.out.println(review.toString());
        }


    }
}
