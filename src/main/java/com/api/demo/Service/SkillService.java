/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.demo.Service;

import com.api.demo.Dto.SkillDto;
import com.api.demo.Model.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.api.demo.Mapper.SkillMapper;
import com.api.demo.Repository.SkillRepository;

/**
 *
 * @author valdiviaricardo
 */
@Service
public class SkillService implements ISkillService{
    
    @Autowired
    private SkillRepository  skillRepository;
    
    @Autowired
    private SkillMapper mapper;
    
    @Override
    public SkillDto createSkill(SkillDto SkillDto) {
        Skill  Skill =  skillRepository.save(mapper.skillDtoToSkill( SkillDto));
        return mapper.skillToSkillDto( Skill);
    }

    @Override
    public ResponseEntity<Void> deleteSkill(Long  SkillId) {
        skillRepository.deleteById( SkillId);
        return ResponseEntity.ok().build();
    }

    @Override
    public SkillDto updateSkill(Long  skillId, SkillDto  skillDto) {
        Skill skill = skillRepository.getReferenceById( skillId);
        skillRepository.save(mapper.updateSkillFromDto( skillDto,  skill));
        return mapper.skillToSkillDto(skill);
    }

    @Override
    public SkillDto getSkill(Long id) {
        return mapper.skillToSkillDto( skillRepository.getReferenceById(id));
    }

    @Override
    public List<SkillDto> getAllSkills() {
        return mapper.allSkillsToSkillsDto(skillRepository.findAll());
    }
}