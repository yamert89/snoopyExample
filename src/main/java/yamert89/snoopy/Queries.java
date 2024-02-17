package yamert89.snoopy;

import com.github.yamert89.snoopy.meta.InjectSQL;

@InjectSQL(fieldsStartWith = "query")
public class Queries {
    private final String query1 = "";
    private String query2;

    public String getQuery1() {
        return query1;
    }

    public String getQuery2() {
        return query2;
    }
}
