package kr.datasolution.demo.sample.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

import kr.datasolution.demo.sample.domain.SampleVo;

//@Mapper
public interface SampleMapper {
	
	List<SampleVo> selectSampleList(SampleVo sampleVo);
	
	SampleVo selectSampleDetail(SampleVo sampleVo);
	
	void insertSample(SampleVo sampleVo);
	
	void updateSample(SampleVo sampleVo);
	
	void deleteSample(SampleVo sampleVo);

}
