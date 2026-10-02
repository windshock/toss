// entry=0x8b3e4

void thunk_FUN_001843a0(void)

{
  undefined4 *in_x9;
  undefined1 *in_x10;
  long lVar1;
  
  *in_x9 = 0xfc2f47df;
  *in_x10 = 0xdf;
  lVar1 = 1;
  do {
    in_x10[lVar1] = *(undefined1 *)((long)in_x9 + lVar1);
    lVar1 = lVar1 + 1;
  } while (lVar1 != 4);
                    /* WARNING: Could not recover jumptable at 0x0017f4f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002818d8)();
  return;
}


