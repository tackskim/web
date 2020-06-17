package Dto;

public class MemberDto {
	private int VIEWCOMMENT_NUM;
	private String VIEWCOMMENT_CONTENT;
	private String VIEWCOMMENT_TITLE;

	private String ADLOGIN_ID;
	private String ADLOGIN_PW;

	// shows 방영 제목,연출,극본,출연
	private String BROAD_TITLE;
	private String BROAD_PRODUCTION;
	private String BROAD_SCREEN;
	private String BROAD_CAST;
	// shows 종영
	private String ENDS_TITLE;
	private String ENDS_PRODUCTION;
	private String ENDS_SCREEN;
	private String ENDS_CAST;

	// 채용공고 경력 제목,내용,사진
	private String CAREER_TITLE;
	private String CAREER_CONTENT;
	private String CAREER_img;
	private int CAREER_NUM;
	
	// 채용공고 신입 경력 제목,내용
	private String CRUNEW_TITLE;
	private String CRUNEW_CONTENT;
	private String CRUNEW_img;
	private int CRUNEW_NUM;
	
	// 채용공고인턴 제목내용,사진
	private String INTERN_TITLE;
	private String INTERN_CONTENT;
	private String INTERN__img;
	private int INTERN__NUM;
	
	// 뉴스 내용,제목,날짜
	private String RELEASES_CONTENT;
	private String RELEASES_DAY;
	private String RELEASES_TITLE;
	private String RELEASES_IMG;
	
	private String USERINFO_ID;
	private String USERINFO_PW;
	
	
	public int getINTERN__NUM() {
		return INTERN__NUM;
	}
	public void setINTERN__NUM(int iNTERN__NUM) {
		INTERN__NUM = iNTERN__NUM;
	}
	public int getCRUNEW_NUM() {
		return CRUNEW_NUM;
	}
	public void setCRUNEW_NUM(int cRUNEW_NUM) {
		CRUNEW_NUM = cRUNEW_NUM;
	}	
	public int getCAREER_NUM() {
		return CAREER_NUM;
	}
	public void setCAREER_NUM(int cAREER_NUM) {
		CAREER_NUM = cAREER_NUM;
	}
	public String getUSERINFO_ID() {
		return USERINFO_ID;
	}
	public void setUSERINFO_ID(String uSERINFO_ID) {
		USERINFO_ID = uSERINFO_ID;
	}
	public String getUSERINFO_PW() {
		return USERINFO_PW;
	}
	public void setUSERINFO_PW(String uSERINFO_PW) {
		USERINFO_PW = uSERINFO_PW;
	}
	public String getUSERINFO_AUTH() {
		return USERINFO_AUTH;
	}
	public void setUSERINFO_AUTH(String uSERINFO_AUTH) {
		USERINFO_AUTH = uSERINFO_AUTH;
	}
	private String USERINFO_AUTH;	
	
	public String getRELEASES_IMG() {
		return RELEASES_IMG;
	}
	public void setRELEASES_IMG(String rELEASES_IMG) {
		RELEASES_IMG = rELEASES_IMG;
	}
	//
	public int getVIEWCOMMENT_NUM() {
		return VIEWCOMMENT_NUM;
	}
	public void setVIEWCOMMENT_NUM(int vIEWCOMMENT_NUM) {
		VIEWCOMMENT_NUM = vIEWCOMMENT_NUM;
	}
	public String getVIEWCOMMENT_CONTENT() {
		return VIEWCOMMENT_CONTENT;
	}
	public void setVIEWCOMMENT_CONTENT(String vIEWCOMMENT_CONTENT) {
		VIEWCOMMENT_CONTENT = vIEWCOMMENT_CONTENT;
	}
	public String getVIEWCOMMENT_TITLE() {
		return VIEWCOMMENT_TITLE;
	}
	public void setVIEWCOMMENT_TITLE(String vIEWCOMMENT_TITLE) {
		VIEWCOMMENT_TITLE = vIEWCOMMENT_TITLE;
	}
	public String getADLOGIN_ID() {
		return ADLOGIN_ID;
	}
	public void setADLOGIN_ID(String aDLOGIN_ID) {
		ADLOGIN_ID = aDLOGIN_ID;
	}
	public String getADLOGIN_PW() {
		return ADLOGIN_PW;
	}
	public void setADLOGIN_PW(String aDLOGIN_PW) {
		ADLOGIN_PW = aDLOGIN_PW;
	}
	public String getBROAD_TITLE() {
		return BROAD_TITLE;
	}
	public void setBROAD_TITLE(String bROAD_TITLE) {
		BROAD_TITLE = bROAD_TITLE;
	}
	public String getBROAD_PRODUCTION() {
		return BROAD_PRODUCTION;
	}
	public void setBROAD_PRODUCTION(String bROAD_PRODUCTION) {
		BROAD_PRODUCTION = bROAD_PRODUCTION;
	}
	public String getBROAD_SCREEN() {
		return BROAD_SCREEN;
	}
	public void setBROAD_SCREEN(String bROAD_SCREEN) {
		BROAD_SCREEN = bROAD_SCREEN;
	}
	public String getBROAD_CAST() {
		return BROAD_CAST;
	}
	public void setBROAD_CAST(String bROAD_CAST) {
		BROAD_CAST = bROAD_CAST;
	}
	public String getENDS_TITLE() {
		return ENDS_TITLE;
	}
	public void setENDS_TITLE(String eNDS_TITLE) {
		ENDS_TITLE = eNDS_TITLE;
	}
	public String getENDS_PRODUCTION() {
		return ENDS_PRODUCTION;
	}
	public void setENDS_PRODUCTION(String eNDS_PRODUCTION) {
		ENDS_PRODUCTION = eNDS_PRODUCTION;
	}
	public String getENDS_SCREEN() {
		return ENDS_SCREEN;
	}
	public void setENDS_SCREEN(String eNDS_SCREEN) {
		ENDS_SCREEN = eNDS_SCREEN;
	}
	public String getENDS_CAST() {
		return ENDS_CAST;
	}
	public void setENDS_CAST(String eNDS_CAST) {
		ENDS_CAST = eNDS_CAST;
	}
	public String getCAREER_TITLE() {
		return CAREER_TITLE;
	}
	public void setCAREER_TITLE(String cAREER_TITLE) {
		CAREER_TITLE = cAREER_TITLE;
	}
	public String getCAREER_CONTENT() {
		return CAREER_CONTENT;
	}
	public void setCAREER_CONTENT(String cAREER_CONTENT) {
		CAREER_CONTENT = cAREER_CONTENT;
	}
	public String getCAREER_img() {
		return CAREER_img;
	}
	public void setCAREER_img(String cAREER_img) {
		CAREER_img = cAREER_img;
	}
	public String getCRUNEW_TITLE() {
		return CRUNEW_TITLE;
	}
	public void setCRUNEW_TITLE(String cRUNEW_TITLE) {
		CRUNEW_TITLE = cRUNEW_TITLE;
	}
	public String getCRUNEW_CONTENT() {
		return CRUNEW_CONTENT;
	}
	public void setCRUNEW_CONTENT(String cRUNEW_CONTENT) {
		CRUNEW_CONTENT = cRUNEW_CONTENT;
	}
	public String getCRUNEW_img() {
		return CRUNEW_img;
	}
	public void setCRUNEW_img(String cRUNEW_img) {
		CRUNEW_img = cRUNEW_img;
	}
	public String getINTERN_TITLE() {
		return INTERN_TITLE;
	}
	public void setINTERN_TITLE(String iNTERN_TITLE) {
		INTERN_TITLE = iNTERN_TITLE;
	}
	public String getINTERN_CONTENT() {
		return INTERN_CONTENT;
	}
	public void setINTERN_CONTENT(String iNTERN_CONTENT) {
		INTERN_CONTENT = iNTERN_CONTENT;
	}
	public String getINTERN__img() {
		return INTERN__img;
	}
	public void setINTERN__img(String iNTERN__img) {
		INTERN__img = iNTERN__img;
	}
	public String getRELEASES_CONTENT() {
		return RELEASES_CONTENT;
	}
	public void setRELEASES_CONTENT(String rELEASES_CONTENT) {
		RELEASES_CONTENT = rELEASES_CONTENT;
	}
	public String getRELEASES_DAY() {
		return RELEASES_DAY;
	}
	public void setRELEASES_DAY(String rELEASES_DAY) {
		RELEASES_DAY = rELEASES_DAY;
	}
	public String getRELEASES_TITLE() {
		return RELEASES_TITLE;
	}
	public void setRELEASES_TITLE(String rELEASES_TITLE) {
		RELEASES_TITLE = rELEASES_TITLE;
	}
	public void setBOARD_FILE(String filesystemName) {
		// TODO Auto-generated method stub
		
	}
}
