package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RawMaterialsController {
	
	//원자재 정보 메인화면
	@GetMapping("/rawMaterials")
	public String meterials() {
		return "rawMaterials/#rawMaterials";
	}
	
	
	//원자재 등록?
	@GetMapping("/addRawMaterials")
	public String addRawMeterials() {
		return "rawMaterials/#addRawMaterials";
	}
		
	//원자재 목록
	@GetMapping("/rawMaterialsList")
	public String getRawMeterialsList() {
		return "rawMaterials/#rawMaterialsList";
	}
	
	
	//자재입고 수정
	@GetMapping("/inWarehousingMaterialsModify")
	public String inWarehousingMaterialsModify(@RequestParam(value = "raw_material_name", required = false)String raw_material_name) {
		return "redirect:/inWarehousingMaterialsList";
	}
	
	//자재입고 리스트
	@GetMapping("/inWarehousingMaterialsList")
	public String InWarehousingMaterialsList() {
		return "rawMaterials/inWarehousingMaterialsList";
	}
	
	//자재 입고 등록 후 자재 입고 목록으로 리다이렉트 , 파라미터는 임시 값
	@PostMapping("/addInWarehousingMaterials")
	public String addInWarehousingMaterials(@RequestParam(value = "raw_material_name", required = false )String raw_material_name) {
		return "redirect:/inWarehousingMaterialsList";
	}
	
	//자재 입고 등록
	@GetMapping("/addInWarehousingMaterials")
	public String addInWarehousingMaterials() {
		return "rawMaterials/addInWarehousingMaterials";
	}
	
	//?
	@GetMapping("/rawmaterialmangement")
	public String rawmaterialmangement() {
		return "rawMaterials/rawMaterials";
	}
}
