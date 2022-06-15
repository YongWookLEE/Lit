package com.example.lit.mapper.user.achievement;

import com.example.lit.domain.vo.user.FollowVO;
import com.example.lit.domain.vo.user.achievement.AchievementVO;
import com.example.lit.domain.vo.user.achievement.MedalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AchievementMapper {
    //메달 추가
    public void insert(FollowVO followVO);
    //메달 전체 해금 유무 (?)
    public List<AchievementVO> getList(Long userNumber);
    //메달 하나 보기
    public AchievementVO select(Long userNumber);


}