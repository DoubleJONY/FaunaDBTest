import com.faunadb.client.FaunaClient;

import static com.faunadb.client.query.Language.*;

/**
 * This example connects to FaunaDB using the secret provided
 * and creates a new database named "my-first-database"
 */
public class Main {
    public static void main(String[] args) throws Exception {

        //Create an admin connection to FaunaDB.
        FaunaClient adminClient =
                FaunaClient.builder()
                        .withSecret("fnAEe-WLSjAARx1vdiO5VELFMU1iLb7f4l-wvJWn")
                        .withEndpoint("https://db.us.fauna.com/") // Adjust for Region Groups
                        .build();

        adminClient.query(
//                CreateDatabase(
//                        Obj("name", Value("my-first-database"))
//                )
                Get(
                    Obj(Ref(Collection("products"), "202"))
                )
        ).get();
    }
}