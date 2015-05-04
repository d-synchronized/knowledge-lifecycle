package uk.co.techblue.bpm.callback;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.switchyard.component.bpm.runtime.BPMUserGroupCallback;

public class HelpDeskUserGroupCallback extends BPMUserGroupCallback {

    public static final Map<String, List<String>> USERS_GROUPS;
    static {
        final Map<String, List<String>> ugm = new LinkedHashMap<String, List<String>>();
        ugm.put("Dishant Anand", Arrays.asList(new String[] { "developers" }));
        ugm.put("Dheeraj Arora", Arrays.asList(new String[] { "users" }));
        USERS_GROUPS = Collections.unmodifiableMap(ugm);
    }

    private static final Properties USERS_GROUPS_PROPERTIES = new Properties();
    static {
        USERS_GROUPS_PROPERTIES.setProperty("Administrator", "Administrators,users,developers");
        USERS_GROUPS_PROPERTIES.setProperty("Dishant Anand", "developers");
        USERS_GROUPS_PROPERTIES.setProperty("Dheeraj Arora", "users");
    }

    public HelpDeskUserGroupCallback() {
        super(USERS_GROUPS_PROPERTIES);
    }

}
