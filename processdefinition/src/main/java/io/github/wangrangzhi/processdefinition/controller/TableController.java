package io.github.wangrangzhi.processdefinition.controller;

import io.github.wangrangzhi.processdefinition.dto.controllerUse.InsertUserDto;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.ListDto;
import io.github.wangrangzhi.processdefinition.dto.controllerUse.ResultDto;
import io.github.wangrangzhi.processdefinition.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev-api/vue-admin-template/table")

@Slf4j
public class TableController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public ResultDto list() throws Exception {

        ResultDto resultDto = new ResultDto();
        resultDto.setCode(20000);
        resultDto.setData(userService.getUser());

        return  resultDto;


//        //language=JSON
//        String a = "{\n" +
//                "  \"code\": 20000,\n" +
//                "  \"data\": {\n" +
//                "    \"total\": 2,\n" +
//                "    \"items\": [\n" +
//                "      {\n" +
//                "       \n" +
//                "        \"name\": \"Ic\",\n" +
//                "        \"phone\": \"draft1\",\n" +
//                "        \"sex\": \"name1\",\n" +
//                "        \"insertdata\": \"1993-10-25 12:00:54\"\n" +
//                "       \n" +
//                "      },\n" +
//                "      {\n" +
//                "        \"id\": \"5200002008\",\n" +
//                "        \"name\": \"Icgei esruudtvb ejdejsq jqg buepvqcxd xswqbg hgwm ocm gagg rftolxa olbf xzp.\",\n" +
//                "        \"phone\": \"draft\",\n" +
//                "        \"sex\": \"name\",\n" +
//                "        \"insertdata\": \"1994-10-25 12:00:54\"" +
//                "\n" +
//                "      }\n" +
//                "    ]\n" +
//                "  " +
//                "}\n" +
//                "}";


     //   return a;


    }

    @RequestMapping("/querylist")
    public ResultDto querylist(@RequestBody ListDto listDto) throws Exception {


        ResultDto resultDto = new ResultDto();
        resultDto.setCode(20000);
        resultDto.setData(userService.searchName(listDto));

        return  resultDto;






    }

}
