package truecut.common.net;

public class Protocol {

	/**
	 * 포인트 서버 용
	 * 
	 * @author AhnJaeHyun
	 *
	 */
	public static class Point {

		public static final int TC_CONNECT_CONTINUE = 0xEE10;
		public static final int TC_CONNECT_LOGIN = 0xEE11;
		public static final int TC_SET_USER_INFO = 0xEE12;
		public static final int TC_GET_CONFIG = 0xEE13;
		public static final int TC_SET_IDENTIFY = 0xEE41;
		public static final int TC_SEND_STATUS = 0xEE64;
	}

	/**
	 * 트루컷 데몬 용
	 * 
	 * @author AhnJaeHyun
	 *
	 */
	public static class Truecut {
		// tc client -> server
		public static final int TC_CONNECT_CONTINUE = 0xEE10;
		public static final int TC_CONNECT_LOGIN = 0xEE11;
		public static final int TC_SET_USER_INFO = 0xEE12;
		public static final int TC_GET_CONFIG = 0xEE13;
		public static final int TC_SEND_STATUS_OLD = 0xEE21;
		public static final int TC_GET_PASSWORD = 0xEE31;
		public static final int TC_SET_IDENTIFY = 0xEE41;
		public static final int TC_SET_VIEW_ADD = 0xEE51;
		public static final int TC_CONNECT_CONTINUE_DNS = 0xEE61;
		public static final int TC_CONNECT_LOGIN_DNS = 0xEE62;
		public static final int TC_SET_MEMDUMP = 0xEE63;
		public static final int TC_SEND_STATUS = 0xEE64;
		public static final int TC_SEND_USERREG = 0xEE65;
		public static final int TC_SEND_REQCONFIG = 0xEE66;
		public static final int TC_CONNECT_LOGOUT = 0xEE67;
		public static final int TC_SET_ZIP = 0xEE68;
		public static final int TC_SET_ZIPPING = 0xEE69;
		public static final int TC_SET_ZIPEND = 0xEE6A;

		// tc server -> client
		public static final int TC_GET_USER_INFO = 0xFF12;
		public static final int TC_SET_CONFIG = 0xFF13;
		public static final int TC_SET_PASSWORD = 0xFF31;
		public static final int TC_GET_IDENTIFY = 0xFF41;
		public static final int TC_DNS_SET_IPOK = 0xFF51;
		public static final int TC_DNS_SET_IPNO = 0xFF52;
		public static final int TC_AUTOPATCH_NOW = 0xFF54;
		public static final int TC_SET_SWEEP = 0xFF55;
		public static final int TC_SET_DELETE = 0xFF56;
		public static final int TC_SET_BHO_OK = 0xFF57;
		// public static final int TC_SET_START_LOG = 0xFF58;
		public static final int TC_SET_RD = 0xFF59;
		public static final int TC_SET_RD_LIST = 0xFF60;
		public static final int TC_SET_RD_ERR = 0xFF61;
		public static final int TC_GET_ZIP = 0xFF62;

		// td client -> server
		public static final int TD_CONNECT_CONTINUE = 0xCE10;
		public static final int TD_CONNECT_LOGIN = 0xCE11;
		public static final int TD_SET_USER_INFO = 0xCE12;
		public static final int TD_GET_CONFIG = 0xCE13;
		public static final int TD_SEND_STATUS_OLD = 0xCE21;
		public static final int TD_GET_PASSWORD = 0xCE31;
		public static final int TD_SET_IDENTIFY = 0xCE41;
		public static final int TD_SET_VIEW_ADD = 0xCE51;
		public static final int TD_SEND_STATUS = 0xCE61;

		// td server -> client
		public static final int TD_GET_USER_INFO = 0xDF12;
		public static final int TD_SET_CONFIG = 0xDF13;
		public static final int TD_SET_PASSWORD = 0xDF31;
		public static final int TD_GET_IDENTIFY = 0xDF41;

		public static final int TC_SET_GATEWAY_USER_INFO = 0xFF10; // 게이트웨이 유저정보 셋팅 플래그
		public static final int TC_SET_GATEWAY_LOG_INFO = 0xFF11; //
	}
}
