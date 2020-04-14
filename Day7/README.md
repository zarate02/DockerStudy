# 7일차

## 로그관리

<code>
<pre>
/var/lib/docker/containers/*/*.log {
  rotate 7
  daily
  compress
  size=1M
  missingok
  delaycompress
  copytruncate
}
</pre>
</code>
