package org.example.Creational.SimpleFactory;

public class Client {

	public static void main(String[] args) {
		 /** We are studying simple factory as it is often confused with "factory method" pattern **/

		 /*
		 * Here we simply move the instantiation logic to a separate class and most commonly to a static method of this class.
		 * Some do not consider simple factory to be a "design pattern", as it's simply a method that
		 * encapsulates object instantiation. Nothing complex goes on in that method.
		 *
		 * Simple factory can be just a method in existing class. Adding a separate class
		 * however allows other parts of your code to use simple factory more easily.
		 *
		 * Simple factory itself doesn't need any state tracking, so it’s best to keep this as a
		 *  static method.
		 *
		 * Example of a Simple Factory
		 * 	The java.text.NumberFormat class has getinstance method, which is an example of simple factory.
		 * */
		Post post = PostFactory.createPost("news");
		NewsPost post1 = (NewsPost) PostFactory.createPost("news");
		System.out.println(post);

	}

}
