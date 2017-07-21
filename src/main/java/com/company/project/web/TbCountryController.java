package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TbCountry;
import com.company.project.service.TbCountryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* Created by liuyu on 2017/07/20.
*/
@RestController
@RequestMapping("/tb/country")
public class TbCountryController {
    @Autowired
    private TbCountryService tbCountryService;

    @PostMapping("/add")
    public Result add(TbCountry tbCountry) {
        tbCountryService.save(tbCountry);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tbCountryService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TbCountry tbCountry) {
        tbCountryService.update(tbCountry);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TbCountry tbCountry = tbCountryService.findById(id);
        return ResultGenerator.genSuccessResult(tbCountry);
    }

//    @Cacheable(value="tb_country")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        PageHelper.startPage(page, size);
        List<TbCountry> list = tbCountryService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
