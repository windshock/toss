// entry=0xc29bc

/* WARNING: Removing unreachable block (ram,0x001c3454) */

void Hc29bc(ulong param_1)

{
  undefined **ppuVar1;
  uint in_w3;
  long in_x9;
  int *unaff_x20;
  long *unaff_x23;
  long unaff_x25;
  
  if ((param_1 & 1) != 0) {
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x001c3460. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027e140)((long)*unaff_x20);
    return;
  }
  *(undefined1 *)
   (unaff_x25 +
   ((in_x9 << ((-DAT_0027a2f0 ^ 0x2a28U) + (-DAT_0027a2f0 & 0x2a28U) * 2 & 0x3f)) >> 0x20)) = 0;
  *unaff_x23 = unaff_x25;
  ppuVar1 = &PTR_LAB_00279948;
  if ((in_w3 & 1) == 0) {
    ppuVar1 = &PTR_LAB_00274808;
  }
                    /* WARNING: Could not recover jumptable at 0x001c4330. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


