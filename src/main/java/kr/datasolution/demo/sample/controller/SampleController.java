package kr.datasolution.demo.sample.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;

import kr.datasolution.demo.sample.domain.SampleVo;
import kr.datasolution.demo.sample.service.SampleService;

@Controller
@RequestMapping(value = "/sample")
public class SampleController {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected MessageSource messageSource;
	 
	@Autowired
	protected LocaleResolver localeResolver;
	
	@Autowired
	protected SampleService sampleService;
	
	@GetMapping(path = "sampleList")
	public String getSampleList(HttpServletRequest request, Model model) {
		logger.debug("[GET]Sample List");
		
		return "sample/list";
	}
	
//	@PostMapping(path = "sampleList")
//	public @ResponseBody Map<String, Object> getSampleList(HttpServletRequest request, @RequestBody SampleVo sampleVo) {
//		logger.debug("[POST]Sample List : {}", sampleVo);
//		
//		List<SampleVo> resultList = sampleService.selectSample(sampleVo);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("list", resultList);
//		
//		if (resultList != null && resultList.size() > 0) {
//			resultMap.put("resultMsg", messageSource.getMessage("api.success.message", null, LocaleContextHolder.getLocale()));
//		} else {
//			resultMap.put("resultMsg", messageSource.getMessage("api.error.message", null, LocaleContextHolder.getLocale()));
//		}
//		return resultMap;
//	}
//	
//	@GetMapping(path = "sampleApiList")
//	public String getSampleApiList(HttpServletRequest request, Model model) {
//		logger.debug("[GET]Sample API List");
//		
//		return "sample/apiList";
//	}
//	
//	@PostMapping(path = "sampleApiList")
//	public @ResponseBody Map<String, Object> getSampleApiList(HttpServletRequest request, @RequestBody HashMap<String, Object> param) {
//		logger.debug("[POST]Sample API List : {}", param);
//		
//		List<Map<String, Object>> resultList = sampleService.selectSampleApi(param);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("list", resultList);
//		
//		if (resultList != null && resultList.size() > 0) {
//			resultMap.put("resultMsg", messageSource.getMessage("api.success.message", null, LocaleContextHolder.getLocale()));
//		} else {
//			resultMap.put("resultMsg", messageSource.getMessage("api.error.message", null, LocaleContextHolder.getLocale()));
//		}
//		return resultMap;
//	}
//	
//	@GetMapping(path = "sampleDetail")
//	public String getSampleDetail(@RequestParam(value="seq") String seq, Model model) {
//		logger.debug("[GET]Sample Detail : {}", seq);
//		model.addAttribute("seq", seq);
//		return "sample/detail";
//	}
//	
//	@PostMapping(path = "sampleDetail")
//	public @ResponseBody Map<String, Object> getSampleDetail(@RequestBody SampleVo sampleVo) {
//		logger.debug("[POST]Sample Detail : {}", sampleVo);
//		
//		SampleVo resultVo = sampleService.selectSampleDetail(sampleVo);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("resultVo", resultVo);
//		resultMap.put("resultMsg", messageSource.getMessage("api.success.message", null, LocaleContextHolder.getLocale()));
//		
//		return resultMap;
//	}
//	
//	@GetMapping(path = "sampleModify")
//	public String getSampleModify(@RequestParam(value="seq") String seq, Model model) {
//		logger.debug("[GET]Sample Modify : {}", seq);
//		model.addAttribute("seq", seq);
//		return "sample/modify";
//	}
//	
//	@PostMapping(path = "modifySample")
//	public @ResponseBody Map<String, Object> modifyNotice(@RequestBody SampleVo sampleVo) {
//		logger.debug("[POST]Sample Modify : {}", sampleVo);
//		
//		sampleService.updateSample(sampleVo);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("resultMsg", messageSource.getMessage("update.success.message", null, LocaleContextHolder.getLocale()));
//		
//		return resultMap;
//	}
//	
//	@PostMapping(path = "removeSample")
//	public @ResponseBody Map<String, Object> removeSample(@RequestBody SampleVo sampleVo) {
//		logger.debug("[POST]Sample Delete : {}", sampleVo);
//		
//		sampleService.deleteSample(sampleVo);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("resultMsg", messageSource.getMessage("delete.success.message", null, LocaleContextHolder.getLocale()));
//		
//		return resultMap;
//	}
//	
//	@GetMapping(path = "sampleRegist")
//	public String getSampleRegist() {
//		logger.debug("[GET]Sample Regist");
//		return "sample/regist";
//	}
//	
//	@PostMapping(path = "addSample")
//	public @ResponseBody Map<String, Object> addSample(@RequestBody SampleVo sampleVo) {
//		logger.debug("[POST]Sample Insert : {}", sampleVo);
//		
//		sampleService.insertSample(sampleVo);
//		
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("resultMsg", messageSource.getMessage("insert.success.message", null, LocaleContextHolder.getLocale()));
//		
//		return resultMap;
//	}

}
