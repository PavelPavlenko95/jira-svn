package by.pavelpavlenko.jira.rest.core.domain.permission;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * User: pvl pvlnk
 */
public class MyPermissionsBean {

    @Expose
    @SerializedName("permissions")
    private PermissionsBean permissions;

    public PermissionsBean getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsBean permissions) {
        this.permissions = permissions;
    }
}
