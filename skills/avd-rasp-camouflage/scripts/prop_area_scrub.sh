#!/system/bin/sh
# §141 — 프로퍼티 원시 영역 잔존 토큰 스크럽 (resetprop --delete 후에도 이름 바이트가
# /dev/__properties__/u:object_r:* 컨텍스트 파일에 남는 것을 실측 — 가드의 직접 mmap
# 스캔 채널(§139) 폐쇄. 가드가 trie를 정석 파싱하면 무해, raw 스캔이면 치명).
# 방법: 같은 길이 채움('x')으로 토큰만 인플레이스 치환 — 해제 엔트리는 trie 밖 죽은 데이터.
# 주의: dd는 seek=(출력) 사용 — skip=은 입력측(§141 사고 기록). 오프셋은 실행 시점 재측정.
TOT=0
for f in /dev/__properties__/u:object_r:*; do
  grep -aobE "qemu|goldfish|ranchu" "$f" 2>/dev/null | while IFS=: read off tok; do
    L=${#tok}
    FILL=$(printf "%*s" $L "" | tr " " "x")
    printf "%s" "$FILL" | dd of="$f" bs=1 seek="$off" count="$L" conv=notrunc 2>/dev/null
  done
done
for f in /dev/__properties__/u:object_r:*; do
  N=$(strings "$f" 2>/dev/null | grep -cE "qemu|goldfish|ranchu")
  TOT=$((TOT+N))
done
echo "SCRUB_DONE residual=$TOT (property_info의 컨텍스트명은 실기기에도 존재 — 무해/불處理)"
