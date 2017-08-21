package discovery.rest;

import discovery.rest.exception.AutoDiscoveryException;
import discovery.rest.request.SubnetRange;
import discovery.rest.response.BrocadeFibreChannelSwitch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/discovery")
public class DiscoveryController {

    @RequestMapping(value = "/scan", method = RequestMethod.POST)
    public List<BrocadeFibreChannelSwitch> scan(@RequestBody SubnetRange subnetRange) throws AutoDiscoveryException {
        subnetRange.validate();

        return null;
    }
}
