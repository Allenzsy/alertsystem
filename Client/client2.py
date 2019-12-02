#!/usr/bin/env python
# -*- coding: utf-8 -*-
import urllib
import json
import http.client
import re
import requests
import time

def client():
	s=requests.session()
	headers = {'Content-Type':'application/json'}
	url = 'http://localhost:8080/sender'   #Post url
	exMessage = {}
	exMessage['systemId'] = 1001
	exMessage['token'] = 'GRXD456'
	exMessage['rankId'] = 201
	exMessage['user_id'] = 2
	exMessage['exDescription'] = '发生了xxx异常'
	exMessage['exOccurtime'] = time.strftime("%Y/%m/%d %H:%M:%S", time.localtime())
	jsonData = json.dumps(exMessage) # 字典转换成Json
	try:
		r = s.post(url,data=jsonData,headers = headers)
		print('已发送预警至预警中台')
	except BaseException:
		print("Error:connection")
	else:
		print('状态码：{}，返回信息：{}'.format(r.status_code, r.text))
		
if __name__ == '__main__':
	flag = False
	while(1):
		times = input('发送预警次数:')
		if(times == 'exit'):
			break
		else:
			try:
				times = int(times)
				flag = True
			except ValueError: #报类型错误，说明不是整型的
				print('请输入正整数')
				flag = False
		if(flag):		
			for i in range(times):
				client()
	

