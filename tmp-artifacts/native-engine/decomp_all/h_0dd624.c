// entry=0xdd624

void Hdd624(void)

{
  void *unaff_x27;
  
  *(undefined8 *)((long)unaff_x27 + 0x18) = 0;
  memset(unaff_x27,0,0x10);
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001e0a88. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_thunk_FUN_001e0440_0027d470)
            ((-DAT_00274f48 | 0xf676ba10cbf878bdU) * 2 - (-DAT_00274f48 ^ 0xf676ba10cbf878bdU));
  return;
}


