package discovery.rest.request;

import discovery.rest.exception.AutoDiscoveryException;
import org.apache.commons.validator.routines.InetAddressValidator;

import javax.validation.constraints.NotNull;

public class SubnetRange {

    @NotNull
    private String ipStart;

    @NotNull
    private String ipEnd;

    public void validate() throws AutoDiscoveryException {
        InetAddressValidator validator = new InetAddressValidator();
        if (!validator.isValid(ipStart)) {
            throw new AutoDiscoveryException("Subnet start IP address is invalid.");
        }
        if (!validator.isValid(ipEnd)) {
            throw new AutoDiscoveryException("Subnet end IP address is invalid.");
        }
    }
}
