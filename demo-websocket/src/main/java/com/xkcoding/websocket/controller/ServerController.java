package com.xkcoding.websocket.controller;

import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONUtil;
import com.xkcoding.websocket.common.WebSocketConsts;
import com.xkcoding.websocket.model.Server;
import com.xkcoding.websocket.payload.ServerVO;
import com.xkcoding.websocket.util.ServerUtil;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 服务器监控Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-17 10:22
 */
@RestController
@RequestMapping("/server")
public class ServerController {

  @Resource
  private SimpMessagingTemplate wsTemplate;

  @GetMapping
  public Dict serverInfo() throws Exception {
    Server server = new Server();
    server.copyTo();
    ServerVO serverVO = ServerUtil.wrapServerVO(server);
    Dict dict = ServerUtil.wrapServerDict(serverVO);
    wsTemplate.convertAndSend(WebSocketConsts.PUSH_SERVER, JSONUtil.toJsonStr(dict));
    return dict;
  }

}
