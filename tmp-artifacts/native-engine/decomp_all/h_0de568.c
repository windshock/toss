// entry=0xde568

void Hde568(void)

{
  uint uVar1;
  void *unaff_x20;
  long unaff_x22;
  
  uVar1 = -(int)DAT_00274f48;
  (*(code *)(&PTR_FUN_0027c1e0)
            [(long)(int)(-0x34078755 - (-(int)DAT_00274f48 ^ 0xffffffffU)) * 300 +
             (long)(int)((uVar1 | 0xcbf879a0) * 2 - (uVar1 ^ 0xcbf879a0))])(DAT_00286248);
  CallSupervisor(0);
  if (unaff_x22 != -1) {
                    /* WARNING: Could not recover jumptable at 0x001df178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*DAT_0027dc50)(DAT_00286248,
                    (-DAT_00274f48 | 0xf676ba10cbf878bcU) + (-DAT_00274f48 & 0xf676ba10cbf878bcU));
    return;
  }
  CallSupervisor(0);
  *(undefined8 *)((long)unaff_x20 + 0x18) = 0;
  memset(unaff_x20,0,0x10);
  CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001dcadc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_00275720)(DAT_0029e380 == 0);
  return;
}


