package javaStudy.basic.class1.ex;

public class MovieReview {
    String title;
    String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public MovieReview() {
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "title='" + title + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
