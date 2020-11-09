package microservices.test.bookratingservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.test.bookratingservice.model.BookRatings;
import microservices.test.bookratingservice.model.Rating;

@RestController
@RequestMapping("/rating")
public class BookRatingController {

	@GetMapping("/{userId}")
	public BookRatings getRating(@PathVariable("userId") Integer userId) {
		BookRatings ratings = new BookRatings();
		ratings.setRatings(new ArrayList<Rating>(Arrays.asList(new Rating(12, userId, 4), new Rating(14, userId, 2))));
		return ratings;
	}
}
