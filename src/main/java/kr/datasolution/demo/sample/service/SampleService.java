package kr.datasolution.demo.sample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import kr.datasolution.demo.sample.domain.SampleVo;
import kr.datasolution.demo.sample.mapper.SampleMapper;

@Service
public class SampleService {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    protected RestTemplate restTemplate;
	
//	@Autowired
//	public SampleMapper sampleMapper;
//	
//	public List<SampleVo> selectSample(SampleVo sampleVo) {
//		return sampleMapper.selectSampleList(sampleVo);
//	}
//	
//	public List<Map<String, Object>> selectSampleApi(HashMap<String, Object> param) {
//		logger.info("Sample Service API");
//		
//		Map<String, Object> resultMap = restTemplate.postForObject("http://localhost:9090/apitest/sample/notice/list", param, Map.class);
//		List<Map<String, Object>> resultList = (List<Map<String, Object>>) resultMap.get("resultList");
//		
//		return resultList;
//	}
//	
//	public SampleVo selectSampleDetail(SampleVo sampleVo) {
//		return sampleMapper.selectSampleDetail(sampleVo);
//	}
//	
//	public void insertSample(SampleVo sampleVo) {
//		sampleMapper.insertSample(sampleVo);
//	}
//	
//	public void updateSample(SampleVo sampleVo) {
//		sampleMapper.updateSample(sampleVo);
//	}
//	
//	public void deleteSample(SampleVo sampleVo) {
//		sampleMapper.deleteSample(sampleVo);
//	}

}
