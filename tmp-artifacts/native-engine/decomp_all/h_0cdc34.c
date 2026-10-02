// entry=0xcdc34

void Hcbd70(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  undefined8 *unaff_x27;
  
  memset(unaff_x27,0,0x10);
  uVar2 = -(int)DAT_00274ed0;
  uVar3 = -(int)DAT_00274ed0;
  *unaff_x27 = (&PTR_FUN_0027c1e0)
               [(long)(int)((uVar3 | 0xc30ecc8d) + (uVar3 & 0xc30ecc8d)) * 300 +
                (long)(int)((uVar2 | 0xc30ecdac) + (uVar2 & 0xc30ecdac))];
  *(uint *)(unaff_x27 + 1) = (-(int)DAT_00274ed0 | 0xc30ecc91U) + (-(int)DAT_00274ed0 & 0xc30ecc91U)
  ;
  memset(unaff_x27 + 2,0,0x10);
  lVar1 = (-DAT_00274ed0 ^ 0x80aa86f7c30eccacU) + (-DAT_00274ed0 & 0x80aa86f7c30eccacU) * 2;
  CallSupervisor(0);
  if (0xfffffffffffff000 <
      (ulong)((lVar1 << 0x20) >> ((-DAT_00274ed0 | 0xccadU) + (-DAT_00274ed0 & 0xccadU) & 0x3f))) {
    CallSupervisor(0);
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001ce7c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00285ad8)
              ((lVar1 << ((-DAT_00274ed0 | 0xccadU) + (-DAT_00274ed0 & 0xccadU) & 0x3f)) >> 0x20,
               (-DAT_00274ed0 | 0x80aa86f7c30ecc96U) * 2 - (-DAT_00274ed0 ^ 0x80aa86f7c30ecc96U));
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x001cdff4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_LAB_002761c0)();
  return;
}


