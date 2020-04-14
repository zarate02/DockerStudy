# 7일차

## 로그관리

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
