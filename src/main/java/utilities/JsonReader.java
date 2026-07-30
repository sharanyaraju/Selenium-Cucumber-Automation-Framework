package utilities;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;


public class JsonReader {


    public static String getValue(
            String user,
            String key
    ) throws Exception {


        ObjectMapper mapper =
                new ObjectMapper();


        JsonNode json =
                mapper.readTree(
                        new File(
                                "src/test/resources/testdata/users.json"
                        )
                );


        return json
                .get(user)
                .get(key)
                .asText();

    }

}