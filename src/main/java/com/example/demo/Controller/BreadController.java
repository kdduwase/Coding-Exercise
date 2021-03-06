package com.example.demo.Controller;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreadController {

	@GetMapping("breeds/list/all")
	public ResponseEntity<?> getBread(){
		
		String jsonString= "{\r\n"
				+ "    \"wolfhound\": [\r\n"
				+ "      \"irish\"\r\n"
				+ "    ],\r\n"
				+ "    \"whippet\": [],\r\n"
				+ "    \"weimaraner\": [],\r\n"
				+ "    \"waterdog\": [\r\n"
				+ "      \"spanish\"\r\n"
				+ "    ],\r\n"
				+ "    \"vizsla\": [],\r\n"
				+ "    \"terrier\": [\r\n"
				+ "      \"american\",\r\n"
				+ "      \"australian\",\r\n"
				+ "      \"bedlington\",\r\n"
				+ "      \"border\",\r\n"
				+ "      \"dandie\",\r\n"
				+ "      \"fox\",\r\n"
				+ "      \"irish\",\r\n"
				+ "      \"kerryblue\",\r\n"
				+ "      \"lakeland\",\r\n"
				+ "      \"norfolk\",\r\n"
				+ "      \"norwich\",\r\n"
				+ "      \"patterdale\",\r\n"
				+ "      \"russell\",\r\n"
				+ "      \"scottish\",\r\n"
				+ "      \"sealyham\",\r\n"
				+ "      \"silky\",\r\n"
				+ "      \"tibetan\",\r\n"
				+ "      \"toy\",\r\n"
				+ "      \"westhighland\",\r\n"
				+ "      \"wheaten\",\r\n"
				+ "      \"yorkshire\"\r\n"
				+ "    ],\r\n"
				+ "    \"stbernard\": [],\r\n"
				+ "    \"springer\": [\r\n"
				+ "      \"english\"\r\n"
				+ "    ],\r\n"
				+ "    \"spaniel\": [\r\n"
				+ "      \"blenheim\",\r\n"
				+ "      \"brittany\",\r\n"
				+ "      \"cocker\",\r\n"
				+ "      \"irish\",\r\n"
				+ "      \"japanese\",\r\n"
				+ "      \"sussex\",\r\n"
				+ "      \"welsh\"\r\n"
				+ "    ],\r\n"
				+ "    \"shihtzu\": [],\r\n"
				+ "    \"shiba\": [],\r\n"
				+ "    \"sheepdog\": [\r\n"
				+ "      \"english\",\r\n"
				+ "      \"shetland\"\r\n"
				+ "    ],\r\n"
				+ "    \"setter\": [\r\n"
				+ "      \"english\",\r\n"
				+ "      \"gordon\",\r\n"
				+ "      \"irish\"\r\n"
				+ "    ],\r\n"
				+ "    \"schnauzer\": [\r\n"
				+ "      \"giant\",\r\n"
				+ "      \"miniature\"\r\n"
				+ "    ],\r\n"
				+ "    \"schipperke\": [],\r\n"
				+ "    \"samoyed\": [],\r\n"
				+ "    \"saluki\": [],\r\n"
				+ "    \"rottweiler\": [],\r\n"
				+ "    \"ridgeback\": [\r\n"
				+ "      \"rhodesian\"\r\n"
				+ "    ],\r\n"
				+ "    \"retriever\": [\r\n"
				+ "      \"chesapeake\",\r\n"
				+ "      \"curly\",\r\n"
				+ "      \"flatcoated\",\r\n"
				+ "      \"golden\"\r\n"
				+ "    ],\r\n"
				+ "    \"redbone\": [],\r\n"
				+ "    \"pyrenees\": [],\r\n"
				+ "    \"puggle\": [],\r\n"
				+ "    \"pug\": [],\r\n"
				+ "    \"poodle\": [\r\n"
				+ "      \"miniature\",\r\n"
				+ "      \"standard\",\r\n"
				+ "      \"toy\"\r\n"
				+ "    ],\r\n"
				+ "    \"pomeranian\": [],\r\n"
				+ "    \"pointer\": [\r\n"
				+ "      \"german\",\r\n"
				+ "      \"germanlonghair\"\r\n"
				+ "    ],\r\n"
				+ "    \"pitbull\": [],\r\n"
				+ "    \"pinscher\": [\r\n"
				+ "      \"miniature\"\r\n"
				+ "    ],\r\n"
				+ "    \"pembroke\": [],\r\n"
				+ "    \"pekinese\": [],\r\n"
				+ "    \"dhole\": [],\r\n"
				+ "    \"deerhound\": [\r\n"
				+ "      \"scottish\"\r\n"
				+ "    ],\r\n"
				+ "    \"dane\": [\r\n"
				+ "      \"great\"\r\n"
				+ "    ],\r\n"
				+ "    \"dalmatian\": [],\r\n"
				+ "    \"dachshund\": [],\r\n"
				+ "    \"cotondetulear\": [],\r\n"
				+ "    \"corgi\": [\r\n"
				+ "      \"cardigan\"\r\n"
				+ "    ],\r\n"
				+ "    \"coonhound\": [],\r\n"
				+ "    \"collie\": [\r\n"
				+ "      \"border\"\r\n"
				+ "    ],\r\n"
				+ "    \"cockapoo\": [],\r\n"
				+ "    \"clumber\": [],\r\n"
				+ "    \"chow\": [],\r\n"
				+ "    \"chihuahua\": [],\r\n"
				+ "    \"cattledog\": [\r\n"
				+ "      \"australian\"\r\n"
				+ "    ],\r\n"
				+ "    \"cairn\": [],\r\n"
				+ "    \"bullterrier\": [\r\n"
				+ "      \"staffordshire\"\r\n"
				+ "    ],\r\n"
				+ "    \"beagle\": [],\r\n"
				+ "    \"basenji\": [],\r\n"
				+ "    \"australian\": [\r\n"
				+ "      \"shepherd\"\r\n"
				+ "    ],\r\n"
				+ "    \"appenzeller\": [],\r\n"
				+ "    \"akita\": [],\r\n"
				+ "    \"airedale\": [],\r\n"
				+ "    \"african\": [],\r\n"
				+ "    \"affenpinscher\": [],\r\n"
				+ "    \"bluetick\": [],\r\n"
				+ "    \"borzoi\": [],\r\n"
				+ "    \"bouvier\": [],\r\n"
				+ "    \"boxer\": [],\r\n"
				+ "    \"brabancon\": [],\r\n"
				+ "    \"briard\": [],\r\n"
				+ "    \"buhund\": [\r\n"
				+ "      \"norwegian\"\r\n"
				+ "    ],\r\n"
				+ "    \"bulldog\": [\r\n"
				+ "      \"boston\",\r\n"
				+ "      \"english\",\r\n"
				+ "      \"french\"\r\n"
				+ "    ],\r\n"
				+ "    \"dingo\": [],\r\n"
				+ "    \"doberman\": [],\r\n"
				+ "    \"elkhound\": [\r\n"
				+ "      \"norwegian\"\r\n"
				+ "    ],\r\n"
				+ "    \"entlebucher\": [],\r\n"
				+ "    \"eskimo\": [],\r\n"
				+ "    \"finnish\": [\r\n"
				+ "      \"lapphund\"\r\n"
				+ "    ],\r\n"
				+ "    \"frise\": [\r\n"
				+ "      \"bichon\"\r\n"
				+ "    ],\r\n"
				+ "    \"germanshepherd\": [],\r\n"
				+ "    \"greyhound\": [\r\n"
				+ "      \"italian\"\r\n"
				+ "    ],\r\n"
				+ "    \"groenendael\": [],\r\n"
				+ "    \"havanese\": [],\r\n"
				+ "    \"hound\": [\r\n"
				+ "      \"afghan\",\r\n"
				+ "      \"basset\",\r\n"
				+ "      \"blood\",\r\n"
				+ "      \"english\",\r\n"
				+ "      \"ibizan\",\r\n"
				+ "      \"plott\",\r\n"
				+ "      \"walker\"\r\n"
				+ "    ],\r\n"
				+ "    \"husky\": [],\r\n"
				+ "    \"keeshond\": [],\r\n"
				+ "    \"kelpie\": [],\r\n"
				+ "    \"komondor\": [],\r\n"
				+ "    \"kuvasz\": [],\r\n"
				+ "    \"labradoodle\": [],\r\n"
				+ "    \"labrador\": [],\r\n"
				+ "    \"leonberg\": [],\r\n"
				+ "    \"lhasa\": [],\r\n"
				+ "    \"malamute\": [],\r\n"
				+ "    \"malinois\": [],\r\n"
				+ "    \"maltese\": [],\r\n"
				+ "    \"mastiff\": [\r\n"
				+ "      \"bull\",\r\n"
				+ "      \"english\",\r\n"
				+ "      \"tibetan\"\r\n"
				+ "    ],\r\n"
				+ "    \"mexicanhairless\": [],\r\n"
				+ "    \"mix\": [],\r\n"
				+ "    \"mountain\": [\r\n"
				+ "      \"bernese\",\r\n"
				+ "      \"swiss\"\r\n"
				+ "    ],\r\n"
				+ "    \"newfoundland\": [],\r\n"
				+ "    \"otterhound\": [],\r\n"
				+ "    \"ovcharka\": [\r\n"
				+ "      \"caucasian\"\r\n"
				+ "    ],\r\n"
				+ "    \"papillon\": []\r\n"
				+ "}";
		
		JSONParser parser = new JSONParser();
		JSONObject coderollsJSONObject = new JSONObject();
		try {
			coderollsJSONObject = (JSONObject) parser.parse(jsonString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(coderollsJSONObject);
	}
}
