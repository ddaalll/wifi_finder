package zerobase.wifi.service;


import zerobase.wifi.dto.WifiInfoDto;
import zerobase.wifi.model.WifiInfoDetailModel;
import zerobase.wifi.model.WifiInfoModel;

import java.util.ArrayList;
import java.util.List;

import step.step2.DataBaseConnection;

public class WifiService extends SqliteConnection {

    /**
     * 와이파이 정보를 저장
     */
    private boolean add(WifiInfoDto model) {

        throw new RuntimeException("구현해 주세요.");
    }

    /**
     * 와이파이 정보의 목록을 리턴
     */
    public ArrayList<WifiInfoDto> getList() {
    	System.out.println("geList in");
    	try {
    		// db 커넥션 붙어서 조회
    		ArrayList<WifiInfoDto> res = DataBaseConnection.getWifiList();
    		System.out.println("res : " + res);
    		return res;
    		
    	} catch (Exception e) {
    		// sysout 넣
    		throw new RuntimeException("구현해 주세요.");
    	}
    	
        
    }

    /**
     * 오픈API에서 와이파이 정보를 가져오고,
     * 그 내용을 데이터베이스에 저장하고,
     * 최종적으로 저장한 개수를 리턴
     */
    public int saveWifiInfo() {

        throw new RuntimeException("구현해 주세요.");
    }

    /**
     * 와이파이 상세 정보 리턴
     */
    public WifiInfoDto getDetail(WifiInfoDetailModel parameter) {

        throw new RuntimeException("구현해 주세요.");
    }
}
