# 7일차

## 로그관리

### vi /etc/logrotate.conf

<pre>
<code>
/var/lib/docker/containers/*/*.log {
  rotate 7
  daily
  compress
  size=1M
  missingok
  delaycompress
  copytruncate
}
</code>
</pre>

### 실행

<pre>
<code>
/usr/sbin/logrotate -f /etc/logrotate.conf
</code>
</pre>

### sudo crontab -e

<pre>
<code>
0 0 * * * /usr/sbin/logrotate -f /etc/logrotate.conf
</code>
</pre>
