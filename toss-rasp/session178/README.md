# session178 산출물
- decode_all_178.txt — 전 [06][len] 후보에 대한 decode_static2.py 검증 결과 (0x1747b8 100% 일치, 나머지=JNI blob 내 위양성 헤더)
- dec_441a4.c — once-복호함수 0x441a4 Ghidra 시도 결과(경계실패 기록)
- blob.dat — blob 0x184110..0x185770 ct/pt 워드 코퍼스(2^32 브루트포스용)
- 도구: ../tmp-artifacts/native-engine/decode_static2.py (최종 정적 디코더), emu_run_fn.py (Unicorn 함수 실행기)
- ../tmp-artifacts/tools/pw_blob2.sh (blob 페이지 트리프와이어 — RELRO 라인 함정 수정본), blobpoll2.sh (고속 폴링)
- 핵심 증권: 레코드1 3중 검증 (Python 모델 == Unicorn 0x441a4 실행 == 라이브 26/26 바이트)

# 추가 (§178-추가): JNI blob 완전 해독
- blob_plaintext.bin — 에뮬 재생 복호 평문 (0x184110..0x1856c0, 라이브 100%)
- blob_strings.txt — 235개 JNI 문자열 인벤토리 (메서드\0시그니처\0난독클래스 o/*)
- 도구 emu_jol_decrypt.py (native-engine/) — SKIP_AFED8=1 python3 emu_jol_decrypt.py
