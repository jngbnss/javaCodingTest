package javaStudy.basic.class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = "인셉션";
        movieReview.review ="인생은 무한 루프";

        MovieReview movieReview1 = new MovieReview("어바웃 타임", "인생 시간 영화!");
        System.out.println(movieReview1.toString());
    }
}
