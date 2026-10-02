// entry=0x9365c

void H9365c(undefined1 *param_1)

{
  undefined4 *in_x9;
  long lVar1;
  
  *in_x9 = 0xd80c2121;
  *param_1 = 0x21;
  lVar1 = 1;
  do {
    param_1[lVar1] = *(undefined1 *)((long)in_x9 + lVar1);
    lVar1 = lVar1 + 1;
  } while (lVar1 != 4);
  *(undefined4 *)(param_1 + 4) = 0;
  *(undefined4 *)(param_1 + 8) = 0;
  *(undefined4 *)(param_1 + 0xc) = 0;
                    /* WARNING: Could not recover jumptable at 0x00193438. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002769d8)();
  return;
}


